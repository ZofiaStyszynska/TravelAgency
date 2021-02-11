import { Component, OnInit, HostBinding } from '@angular/core';
import {User} from "../../user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserService} from "../../user.service";
import {
  trigger,
  state,
  style,
  animate,
  transition,
  // ...
} from '@angular/animations';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css'],
  animations: [trigger,
    state,
    style,
    animate,
    transition,

  ]
})
export class UserFormComponent implements OnInit {

  user: User;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService) {

  }
  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }

  ngOnInit(): void {
  }

}
