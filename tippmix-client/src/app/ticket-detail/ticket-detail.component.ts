import { Component, OnInit } from '@angular/core';
import { Ticket } from '../ticket';
import { ActivatedRoute } from '@angular/router';
import { TicketService } from '../ticket.service';

@Component({
  selector: 'ticket-detail',
  templateUrl: './ticket-detail.component.html',
  styleUrls: ['./ticket-detail.component.css']
})
export class TicketDetailComponent implements OnInit {

  ticket: Ticket = null;

  constructor(
    private route: ActivatedRoute,
    private ticketService: TicketService
  ) { }
  
  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');
    this.ticket = this.ticketService.getTicket(id);
  }
}
