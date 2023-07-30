import { TestBed } from '@angular/core/testing';

import { BoatslistService } from './boatslist.service';

describe('BoatslistService', () => {
  let service: BoatslistService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BoatslistService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
