import { TestBed, inject } from '@angular/core/testing';

import { ToDoService } from './to-do.service';

describe('ToDoService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [ToDoService]
    });
  });

  it('should be instantiated', inject([ToDoService], (service: ToDoService) => { }));
});
