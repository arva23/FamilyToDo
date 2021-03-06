import { Component } from '@angular/core';
import { UserService } from '../../services/user.service';
import { Router } from '@angular/router';
import { User } from '../../models/user';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { NotificationService } from '../../services/notification.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  private _pageTitle: string;

  constructor(
    private userService: UserService,
    private router: Router,
    private notificationService: NotificationService
  ) {
    this._pageTitle = 'Log in';
  }

  public get pageTitle() {
    return this._pageTitle;
  }

  private logIn(username: string, password: string, event: Event): void {
    event.preventDefault();
    this.userService.logIn(username, password).subscribe(response => {
      this.userService.setLoggedIn(new User(response));
      this.router.navigate(['/tasklist']);
      this.notificationService.showSuccess('Successfully logged in.');
    }, response => this.notificationService.showError(response));
  }
}