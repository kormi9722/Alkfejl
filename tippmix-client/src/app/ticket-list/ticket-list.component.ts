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
        status: 'NEW',
      },
      {
        id: 2,
        fixture: 30,
        bets: 'Middle',
        status: 'IMPROGRESS'
      },
      {
        id: 3,
        fixture: -30,
        bets: 'Bad',
        status: 'RESOLVED'
      },
    ]

  filteredTicket: Ticket[];
  selectedTicket: string;

  constructor() { }

  ngOnInit(): void {
    this.selectedTicket = '';
    this.filter();
  }
  filter() {
    this.filteredTicket = this.selectedTicket === ''
      ? this.tickets
      : this.tickets.filter(ticket => ticket.status === this.selectedTicket);

  }

}
