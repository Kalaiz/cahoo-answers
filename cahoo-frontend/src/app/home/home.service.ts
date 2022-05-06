import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';
import { BASE_URL } from '../app.component'
import { Question } from '../shared/question';
@Injectable({
    providedIn: 'root',
})
export class HomeService {
    private recentQuestionUrl = BASE_URL + "/recent-questions";

    constructor(private http: HttpClient) { }

    getRecentQuestions(): Observable<Question[]> {
        return this.http.get<Question[]>(this.recentQuestionUrl,{
            headers: new HttpHeaders({ 'Content-Type': 'application/json' })
          }).pipe(catchError(this.handleError<Question[]>("getRecentQuestion", [])))
    }

    private handleError<T>(methodCall = "None", result?: T) {
        return (error: any): Observable<T> => {
            console.error(error);
            return of(result as T);
        };
    }

}