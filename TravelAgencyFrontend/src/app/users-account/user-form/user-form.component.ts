import {Component, Input, OnInit} from '@angular/core';
import {Address, User} from "../../user";
import {ActivatedRoute, Router} from "@angular/router";
import {UserService} from "../../user.service";


@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: User;
  address: Address


  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService,
    ) {


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
