import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';
import { TicketService } from '../ticket.service';

@Component({
  selector: 'ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  tickets: Ticket[] = [];

  filteredTicket: Ticket[];
  selectedStatus: string;
  selectedTicket: Ticket;

  constructor(
    private ticketService: TicketService 
  ) {
    this.tickets=ticketService.getTickets();
  }

  ngOnInit() {
    this.selectedStatus = '';
    this.filter();
  }

  public onFilterChange(status: string) {
    this.selectedStatus = status;
    this.filter();
  }


  filter() {
    this.filteredTicket = this.selectedStatus === ''
      ? this.tickets
      : this.tickets.filter(ticket => ticket.status === this.selectedStatus);

  }

  public onSelectedTicket(ticket: Ticket)
  {
    this.selectedTicket=ticket;
  }

}
