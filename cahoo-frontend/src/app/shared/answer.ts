class Answer{
    private isBestAnswer:boolean;
    private answer:string;
    private answerer:User;
    private numberOfUpvotes:number;
    private numberOfDownvotes:number;
    private rating:number;
    private id:number;

    constructor(isBestAnswer:boolean,answer:string,answerer:User,numberOfUpvotes:number,numberOfDownvotes:number,rating:number,id:number){
        this.isBestAnswer= isBestAnswer;
        this.answer= answer;
        this.answerer= answerer;
        this.numberOfUpvotes = numberOfUpvotes;
        this.numberOfDownvotes = numberOfDownvotes;
        this.rating = rating;
        this.id = id;
    }

}