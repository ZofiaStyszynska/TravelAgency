import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-main-site',
  templateUrl: './main-site.component.html',
  styleUrls: ['./main-site.component.css']
})
export class MainSiteComponent implements OnInit {

  continents: Array<any>;

  constructor() {

    this.continents = [
    {imgContinent: "https://cdn.pixabay.com/photo/2015/04/09/16/31/africa-714714_960_720.png", buttonContinent: "Afryka"}, // Afryka
    {imgContinent: 2, buttonContinent: 2}, // Ameryka Północna
    {imgContinent: 3, buttonContinent: 3}, // Ameryka Południowa
    {imgContinent: 4, buttonContinent: 4}, // Australia
    {imgContinent: 5, buttonContinent: 5}, // Azja
    {imgContinent: 6, buttonContinent: 6}  // Europa

  ];
  }

  ngOnInit(): void {
  }

}
