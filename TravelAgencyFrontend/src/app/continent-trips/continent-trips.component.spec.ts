import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContinentTripsComponent } from './continent-trips.component';

describe('ContinentTripsComponent', () => {
  let component: ContinentTripsComponent;
  let fixture: ComponentFixture<ContinentTripsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContinentTripsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContinentTripsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
