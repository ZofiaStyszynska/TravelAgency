import {Component, Input, OnInit} from '@angular/core';
import {Trip} from "../trip/trip";

@Component({
  selector: 'app-continent',
  templateUrl: './continent.component.html',
  styleUrls: ['./continent.component.css']
})
export class ContinentComponent implements OnInit {

  @Input()
public continentName : string;
  @Input()
public imgLink : string;
  @Input()
  public type: string;


  constructor() {

  }

  ngOnInit(): void {

  }
}
