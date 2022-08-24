export class Educacion {
    id?: number;
    nombreE: string;
    descripcionE: string;
    img: string;

    constructor(img: string, nombreE: string, descripcionE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.img = img;
    }
}