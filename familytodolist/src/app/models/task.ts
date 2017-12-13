import { BaseModel } from './base-model';
import { User } from './user';
import { Category } from './category'
import { TimeInterval } from './time-interval'
 
export class Task extends BaseModel {

    public name: string;
    public description: string;
    public user: User;
    public category: Category;
    public timeInterval: TimeInterval;
    public status: Status;

    constructor(object) {
        super(object.id);
        Object.assign(this, object);
    }
}

export enum Status{
    INPROGRESS, DONE    
}