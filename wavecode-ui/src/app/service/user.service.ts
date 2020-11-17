import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {environment} from "../../environments/environment";
import {GET_ADMIN_CONTENT, GET_PUBLIC_CONTENT, GET_USER_CONTENT} from "./http/http-client.service";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(
    private http: HttpClient
  ) { }

  getPublicContent(): Observable<any> {
    return this.http.get(GET_PUBLIC_CONTENT, { responseType: 'text' });
  }

  getUserBoard(): Observable<any> {
    return this.http.get(GET_USER_CONTENT, { responseType: 'text' });
  }

  getAdminBoard(): Observable<any> {
    return this.http.get(GET_ADMIN_CONTENT, { responseType: 'text' });
  }
}
