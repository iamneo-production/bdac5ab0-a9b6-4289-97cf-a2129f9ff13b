import { TestBed } from '@angular/core/testing';

import { AdminactivateService } from './adminactivate.service';

describe('AdminactivateService', () => {
  
  let service: AdminactivateService;

  beforeEach(() => {
    
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminactivateService);
    
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
    
  });
  
});

