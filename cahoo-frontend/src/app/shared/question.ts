class Question{
    private isResolved:boolean;
    private question:string;
    private answers:Answer[];

    constructor(isResolved:boolean,question:string,answers:Answer[]){
        this.isResolved=isResolved;
        this.answers=answers;
        this.question= question;
    }


}