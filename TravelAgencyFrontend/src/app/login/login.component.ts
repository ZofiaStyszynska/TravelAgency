import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private login: string;

  constructor(private router: ActivatedRoute) {
  }

  ngOnInit() {

    this.router.params.subscribe((params: Params) => {
      this.login = params['users'];
    })
  }

}
