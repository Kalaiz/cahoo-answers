import { Component, HostListener, OnInit } from '@angular/core';
import { Question } from '../shared/question';
import { HomeService } from './home.service';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private homeService: HomeService) { }

  recentQuestions: Question[] = [];

  ngOnInit(): void {
    this.getRecentQuestions();
  }

  isOpened: boolean = true;

  readonly DESKTOP_VIEW_WIDTH: number = 960;
  readonly CATEGORIES: Array<string> = ["All categories", "Arts & Humanities",
    "Beauty & Style", "Business & Finance", "Cars & Transportation", "Computers & Internet", "Consumer Electronics", "Dining Out"
    , "Education & Reference", "Entertainment & Music", "Environment", "Family & Relationships", "Food & Drink",
    "Games & Recreation", "Health", "Home & Garden", "Local Businesses", "Pets", "Politics & Government"
    , "Pregnancy & Parenting", "Science & Mathematics"]

  @HostListener('window:resize', ['$event.target.innerWidth'])
  onResize(width: number) {
    this.isOpened = width <= this.DESKTOP_VIEW_WIDTH;
  }

  getRecentQuestions(): void {
    this.homeService.getRecentQuestions().subscribe(recentQuestions => this.recentQuestions = recentQuestions);
  }

}
