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
    {imgContinent: "https://www.toptravel.pl/wp-content/uploads/Afryka/Afryka-wycieczki.png", buttonContinent: "Afryka", type:'AFRICA'},  // Afryka
    {imgContinent: "https://www.toptravel.pl/wp-content/uploads/Ameryka-Srodkowa-wycieczki.png", buttonContinent: "Ameryka północna", type:'NORTH_AMERICA'}, // Ameryka środkowa
    {imgContinent: "https://www.toptravel.pl/wp-content/uploads/Australia/Australia-wycieczki.png", buttonContinent: "Australia", type: 'AUSTRALIA'}, // Australia
    {imgContinent: "https://www.toptravel.pl/wp-content/uploads/Azja/Azja-wycieczki.png", buttonContinent: "Azja", type: "ASIA"}, // Azja
    {imgContinent: "https://www.toptravel.pl/wp-content/uploads/Europa/Europa-wycieczki.png", buttonContinent: "Europa", type: 'EUROPE'}  // Europa

  ];
  }

  ngOnInit(): void {
  }

}
