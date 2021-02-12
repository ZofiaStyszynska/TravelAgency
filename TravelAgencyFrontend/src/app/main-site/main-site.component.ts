import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-main-site',
  templateUrl: './main-site.component.html',
  styleUrls: ['./main-site.component.css']
})
export class MainSiteComponent implements OnInit {

  continents: Array<any>;


  constructor() {

    this.continents = [
      {
        imgContinent: "https://www.toptravel.pl/wp-content/uploads/Afryka/Afryka-wycieczki.png",
        buttonContinent: "Afryka",
        type: 'AFRICA',
        routerLink: ['../trip', 4]
      },
      {
        imgContinent: "https://www.toptravel.pl/wp-content/uploads/Ameryka-Srodkowa-wycieczki.png",
        buttonContinent: "Ameryka północna",
        type: 'NORTH_AMERICA',
        routerLink: ['../trip', 3]
      },
      {
        imgContinent: "https://www.toptravel.pl/wp-content/uploads/Australia/Australia-wycieczki.png",
        buttonContinent: "Australia",
        type: 'AUSTRALIA',
        routerLink: ['../trip', 5]
      },
      {
        imgContinent: "https://www.toptravel.pl/wp-content/uploads/Azja/Azja-wycieczki.png",
        buttonContinent: "Azja",
        type: "ASIA",
        routerLink: ['../trip', 2]
      },
      {
        imgContinent: "https://www.toptravel.pl/wp-content/uploads/Europa/Europa-wycieczki.png",
        buttonContinent: "Europa",
        type: 'EUROPE',
        routerLink: ['../trip', 1]
      }

    ];
  }

  ngOnInit(): void {
  }

}
