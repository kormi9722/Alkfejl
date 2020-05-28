import { RouterModule, Routes } from '@angular/router';

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TicketListComponent } from '../ticket-list/ticket-list.component';
import { TicketFormComponent } from '../ticket-form/ticket-form.component';
import { TicketDetailComponent } from '../ticket-detail/ticket-detail.component';

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
];

@NgModule({

  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class RoutingModule { }
