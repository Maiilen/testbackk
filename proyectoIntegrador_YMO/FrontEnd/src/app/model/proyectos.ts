export class Proyectos{
    id?: number;
    nombreP: string;
    descripcionP: string;
    img: string;

    constructor(img: string, nombreP: string, descripcionP: string){
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.img = img;
    }
}