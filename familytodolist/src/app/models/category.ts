import { BaseModel } from './base-model';

export class Category extends BaseModel {

    public name: string;
    public description: string;

    constructor(object) {
        super(object.id);
        Object.assign(this, object);
    }
}