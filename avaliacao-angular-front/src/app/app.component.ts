import { Component } from '@angular/core';
import { Avaliacao } from './avaliacao';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'avaliacao-angular-front';

  dados : Avaliacao[];

  constructor(private _http: HttpClient) {}

  ngOnInit() {
    this.listar();
  }

  listar() {    
       let a  = this._http.get<Avaliacao[]>("http://192.168.0.73:8080/avaliacao/dados")
       .pipe(map(data => data)).subscribe(
        restItems => {          
          console.log(restItems);   
          this.dados  = restItems;     
        }
      )     
  } 


}
