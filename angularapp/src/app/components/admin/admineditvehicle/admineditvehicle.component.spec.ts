








import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmineditvehicleComponent } from './admineditvehicle.component';

describe('AdmineditvehicleComponent', () => {
  let component: AdmineditvehicleComponent;
  let fixture: ComponentFixture<AdmineditvehicleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdmineditvehicleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdmineditvehicleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
