import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'client';

  private url: string = '/api/map';
  ngOnInit(): void {
      fetch(this.url)
        .then((response) => response.json())
        .then(console.log);
    }
}
