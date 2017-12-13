import { BaseModel } from './base-model';

export class TimeInterval extends BaseModel {

    public startTime: string;
    public terminationTime: String;

    constructor(object) {
        super(object.id);
        Object.assign(this, object);
    }
}