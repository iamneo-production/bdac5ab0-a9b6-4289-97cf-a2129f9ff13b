import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListofvehiclesComponent } from './listofvehicles.component';

describe('ListofvehiclesComponent', () => {
  let component: ListofvehiclesComponent;
  let fixture: ComponentFixture<ListofvehiclesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListofvehiclesComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListofvehiclesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
