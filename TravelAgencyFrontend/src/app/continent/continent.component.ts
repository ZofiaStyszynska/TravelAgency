import {Component, Input, OnInit} from '@angular/core';

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


  constructor() {




  }

  ngOnInit(): void {
  }
}
