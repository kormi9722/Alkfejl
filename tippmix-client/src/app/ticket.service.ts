import { Injectable } from '@angular/core';
import { Ticket } from "./ticket";

@Injectable({
  providedIn: 'root'
})
export class TicketService {

  tickets: Ticket[] =
    [
      {
        id: 1,
        fixture: 300,
        bets: 'Good',
        status: 'WINNER',
      },
      {
        id: 2,
        fixture: 30,
        bets: 'Middle',
        status: 'WAITING FOR RESULT'
      },
      {
        id: 3,
        fixture: -30,
        bets: 'Bad',
        status: 'LOST'
      },
      {
        id: 4,
        fixture: 0,
        bets: 'Bad',
        status: 'NEW'
      }
    ]
  constructor() { }
  
  getTickets() : Ticket[] {
    return this.tickets;
  }
  
  getTicket(id: number) : Ticket{
    return this.tickets.find(i => i.id == id);
  }

}