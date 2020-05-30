import { Component, OnInit } from '@angular/core';
import { League } from '../league';

@Component({
  selector: 'app-league-list',
  templateUrl: './league-list.component.html',
  styleUrls: ['./league-list.component.css']
})
export class LeagueListComponent implements OnInit {

  leagues: League[] =
      [
        {
          name: "World Betting Championship",
          position: 14889.
        },
        {
          name: "Friendly League",
          position: 1,
        },
      ]

  constructor() { }

  ngOnInit(): void {
  }

}
