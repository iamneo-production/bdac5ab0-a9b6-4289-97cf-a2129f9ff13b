import { TestBed } from '@angular/core/testing';

import { AddpassengersService } from './addpassengers.service';

describe('AddpassengersService', () => {
  let service: AddpassengersService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddpassengersService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
