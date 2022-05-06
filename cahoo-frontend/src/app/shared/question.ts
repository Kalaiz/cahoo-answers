import { Answer } from "./answer";

export interface Question{
    isResolved:boolean;
    question:string;
    answers:Answer[];

}