import { BaseModel } from './base-model';

export class User extends BaseModel {

    public username: string;
    public password: string
    public role: Role;

    constructor(object) {
        super(object.id);
        Object.assign(this, object);
    }
}

export enum Role{
    USER, ADMIN, GUEST    
}