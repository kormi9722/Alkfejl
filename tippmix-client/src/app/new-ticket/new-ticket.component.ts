import { Component, OnInit } from '@angular/core';
import { Fixture } from '../fixture';

@Component({
  selector: 'app-new-ticket',
  templateUrl: './new-ticket.component.html',
  styleUrls: ['./new-ticket.component.css']
})
export class NewTicketComponent implements OnInit {

  fixtures: Fixture[] =
        [
  {
                      fixture: 2,
                      fixture_id: 1,
                      home: "Liverpool",
                      home_score: "-",
                      away_score: "-",
                      away: "Real Madrid",
                      outcome: "-",
                    },
                    {
                     fixture: 2,
                     fixture_id: 2,
                     home: "Arsenal",
                     home_score: "-",
                     away_score: "-",
                     away: "Milan",
                     outcome: "-",
                     },
          {
                      fixture: 2,
                      fixture_id: 3,
                      home: "Barcelona",
                      home_score: "-",
                      away_score: "-",
                      away: "Dortmund",
                      outcome: "",
                    },
                    {
                     fixture: 2,
                     fixture_id: 4,
                     home: "PSG",
                     home_score: "-",
                     away_score: "-",
                     away: "Juventus",
                     outcome: "-",
                     },
          {
                      fixture: 2,
                      fixture_id: 5,
                      home: "Bayern Munich",
                      home_score: "-",
                      away_score: "-",
                      away: "Monaco",
                      outcome: "-",
                    },
        {
                    fixture: 1,
                    fixture_id: 1,
                    home: "Liverpool",
                    home_score: "2",
                    away_score: "2",
                    away: "Barcelona",
                    outcome: "X",
                  },
                  {
                   fixture: 1,
                   fixture_id: 2,
                   home: "Arsenal",
                   home_score: "0",
                   away_score: "1",
                   away: "Juventus",
                   outcome: "V",
                   },
        {
                    fixture: 1,
                    fixture_id: 3,
                    home: "Real Madrid",
                    home_score: "3",
                    away_score: "2",
                    away: "Dortmund",
                    outcome: "H",
                  },
                  {
                   fixture: 1,
                   fixture_id: 4,
                   home: "Bayern Munich",
                   home_score: "3",
                   away_score: "0",
                   away: "Milan",
                   outcome: "H",
                   },
        {
                    fixture: 1,
                    fixture_id: 5,
                    home: "PSG",
                    home_score: "0",
                    away_score: "0",
                    away: "Monaco",
                    outcome: "X",
                  },
        ]


  constructor() { }

  ngOnInit(): void {
  }

}
