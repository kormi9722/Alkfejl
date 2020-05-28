import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';

@Component({
  selector: 'ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  tickets: Ticket[] =
    [
      {
        id: 1,
        fixture: 300,
        bets: 'Good',
      },
      {
        id: 2,
        fixture: 30,
        bets: 'Middle',
      },
      {
        id: 3,
        fixture: -30,
        bets: 'Bad',
      },
    ]

  constructor() { }

  ngOnInit(): void {
  }

}
