import {Component, OnInit} from '@angular/core';
import {CityService} from "./service/city.service";
import {take} from "rxjs/operators";
import {City} from "./model/city.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'wavecode-ui';

  cities: City[];

  constructor(
    private citiService: CityService
  ) { }

  async ngOnInit() {
    this.cities = await this.citiService.getCities().pipe(take(1)).toPromise();
    console.log(this.cities);
  }

}


