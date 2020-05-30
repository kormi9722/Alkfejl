import { RouterModule, Routes } from '@angular/router';

import { NgModule } from '@angular/core';
import { TicketListComponent } from '../ticket-list/ticket-list.component';
import { TicketFormComponent } from '../ticket-form/ticket-form.component';
import { TicketDetailComponent } from '../ticket-detail/ticket-detail.component';
import { LeagueListComponent } from '../league-list/league-list.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/tickets',
    pathMatch: 'full'
  },
  {
    path: 'tickets',
    component: TicketListComponent
  },
  {
    path: 'tickets/new',
    component: TicketFormComponent
  },
  {
    path: 'tickets/:id',
    component: TicketDetailComponent
  },
  {
    path: 'leagues',
    component: LeagueListComponent
  },
];

@NgModule({

  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class RoutingModule { }
