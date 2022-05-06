import { HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';

export const BASE_URL = "http://localhost:8080"
export const BASIC_HTTP_HEADER_OPTIONS = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Cahoo Answers';

}
