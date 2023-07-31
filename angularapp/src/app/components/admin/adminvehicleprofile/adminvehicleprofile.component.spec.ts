import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminvehicleprofileComponent } from './adminvehicleprofile.component';

describe('AdminvehicleprofileComponent', () => {
  let component: AdminvehicleprofileComponent;
  let fixture: ComponentFixture<AdminvehicleprofileComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdminvehicleprofileComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminvehicleprofileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
