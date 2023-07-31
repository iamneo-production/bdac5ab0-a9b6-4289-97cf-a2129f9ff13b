import { TestBed } from '@angular/core/testing';

import { UseractivateService } from './useractivate.service';

describe('UseractivateService', () => {
  let service: UseractivateService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UseractivateService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
