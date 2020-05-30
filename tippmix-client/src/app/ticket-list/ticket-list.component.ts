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
        status: 'INPROGRESS'
      },
      {
        id: 3,
        fixture: -30,
        bets: 'Bad',
        status: 'RESOLVED'
      },
    ]

  filteredTicket: Ticket[];
  selectedStatus: string;

  constructor() { }

  ngOnInit() {
    this.selectedStatus = '';
    this.filter();
  }

  onFilterChange(status: string) {
    this.selectedStatus = status;
    this.filter();
  }


  filter() {
    this.filteredTicket = this.selectedStatus === ''
      ? this.tickets
      : this.tickets.filter(ticket => ticket.status === this.selectedStatus);

  }

}
