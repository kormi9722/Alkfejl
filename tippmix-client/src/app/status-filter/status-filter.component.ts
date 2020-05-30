import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'status-filter',
  templateUrl: './status-filter.component.html',
  styleUrls: ['./status-filter.component.css']
})
export class StatusFilterComponent implements OnInit {

  statuses: string[] = [ 'NEW', 'INPROGRESS', 'RESOLVED', 'CLOSED' ];
  @Input('status') selectedStatus: string = '';

  constructor() { }

  ngOnInit() {

  }

  onFilterChange(status: string) {
    this.selectedStatus = status;
  }

}