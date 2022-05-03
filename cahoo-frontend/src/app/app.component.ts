import { Component, HostListener } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Cahoo Answers';
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
}
