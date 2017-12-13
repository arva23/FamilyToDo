import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';

type Task = { name: string, done: boolean };

@Injectable()
export class ToDoService {

  private tasks: Task[];

  constructor() {
    this.tasks = [
      { name: 'buy Bitcoin', done: false }
    ];
  }

  getAll(): Observable<Task[]> {
    return of(this.tasks);
  }

  toggle(task: Task) {
    task.done = !task.done;
  }

  add(task: Task) {
    this.tasks.push(task);
  }

  remove(task: Task) {
    const index = this.tasks.indexOf(task);

    this.tasks.splice(index, 1);
  }

}
