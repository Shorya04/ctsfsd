export class userModel{
     
    constructor(
        public username: string, 
        public email: string,
        public phone: number,
        public gender: string,
        public category: string,
        public subscribe: boolean
    ){
       
    }
}