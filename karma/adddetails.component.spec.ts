import { ComponentFixture, TestBed } from '@angular/core/testing';
// import { RouterTestingModule } from '@angular/router/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { AdddetailsComponent } from './adddetails.component';

describe('AdddetailsComponent', () => {
  let component: AdddetailsComponent;
  beforeEach(() => TestBed.configureTestingModule({
    imports: [HttpClientTestingModule], 
    providers: [AdddetailsComponent]
  }));
  beforeEach(() => {
    const fixture = TestBed.createComponent(AdddetailsComponent);
    component = fixture.componentInstance;
  });
  it('FE_customerAddDetails', () => {
    expect(component).toBeTruthy();
  });
});