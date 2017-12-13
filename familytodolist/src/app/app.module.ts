import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
//import { ToDoListComponent } from './to-do-list/to-do-list.component';
import { ToDoService } from './to-do.service';
import { LoginComponent } from './components/login/login.component';
/*import { RegisterComponent } from './register/register.component';
import { SingletaskComponent } from './singletask/singletask.component';*/


@NgModule({
  declarations: [
    LoginComponent,
    AppComponent/*,
    ToDoListComponent,
    ,
    RegisterComponent,
    SingletaskComponent*/
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [
    ToDoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
