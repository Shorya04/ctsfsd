import { Pipe,PipeTransform} from '@angular/core'
import { TitleCasePipe } from '@angular/common'

@Pipe({
name:'salutation'
})

export class TitlePipe implements PipeTransform{

    transform(value: String,gender:String): String{
        if(gender=="Male"){
        return "Mr."+value;
        }
        else{
        return "Ms."+value;
    }

}
}
