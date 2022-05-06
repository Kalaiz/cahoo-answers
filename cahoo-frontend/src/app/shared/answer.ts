import { User } from "./user";

export interface Answer{
    isBestAnswer:boolean;
    answer:string;
    answerer:User;
    numberOfUpvotes:number;
    numberOfDownvotes:number;
    rating:number;
    id:number;


}