import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tasklist',
  templateUrl: './tasklist.component.html',
  styleUrls: ['./tasklist.component.css']
})
export class TasklistComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}


/*
import { Component, OnInit } from '@angular/core';
import { ToDoService } from '../to-do.service';
import { NgModel } from '@angular/forms';

@Component({
  selector: 'to-do-list',
  templateUrl: './to-do-list.component.html',
  styleUrls: ['./to-do-list.component.css']
})
export class ToDoListComponent implements OnInit {

  tasks: { name: string, done: boolean }[];

  constructor(private toDoService: ToDoService) { }

  ngOnInit() {
    setTimeout(() => this.toDoService.getAll().subscribe(tasks => this.tasks = tasks), 3000);
  }

  toggleTask(task) {
    this.toDoService.toggle(task);
  }

  addTask(task: NgModel) {
    this.toDoService.add({ name: task.value, done: false });

    task.reset();
  }

  removeTask(task) {
    this.toDoService.remove(task);
  }

}



*/