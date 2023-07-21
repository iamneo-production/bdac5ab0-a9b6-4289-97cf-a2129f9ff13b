import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { UserbookingsComponent } from './userbookings.component';

describe('UserbookingsComponent', () => {
  let component: UserbookingsComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [UserbookingsComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(UserbookingsComponent);
    component = fixture.componentInstance;
  });
  it('FE_userBookings', () => {
    expect(component).toBeTruthy();
  });
});