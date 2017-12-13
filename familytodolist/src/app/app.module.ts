import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatToolbarModule, MatButtonModule, MatMenuModule, MatProgressSpinnerModule,
  MatIconModule, MatListModule, MatCardModule, MatTableModule, MatInputModule,
  MatSelectModule, MatSnackBarModule, MatFormFieldModule, MatDialogModule } from '@angular/material';

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
  bootstrap: [AppComponent]/*, 
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ]*/
})
export class AppModule { }
