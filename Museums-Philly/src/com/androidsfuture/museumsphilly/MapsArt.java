 package com.androidsfuture.museumsphilly;

import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class MapsArt<PointLocation> extends MapActivity {
    /** Called when the activity is first created. */
	List<Overlay> mapOverlays;
	Drawable drawable;
	MuseumItemizedOverlay itemizedOverlay;
	Context mContext;
	MapView mapView;
	MyLocationOverlay me=null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);

        mapView = (MapView) findViewById(R.id.mapview);
        mapView.setBuiltInZoomControls(true);
        
        mapOverlays = mapView.getOverlays();
        drawable = this.getResources().getDrawable(R.drawable.museum_48);
        itemizedOverlay = new MuseumItemizedOverlay(drawable);
        
        me=new MyLocationOverlay(this, mapView);
        
        me.runOnFirstFix(new Runnable() { public void run() {
            mapView.getController().animateTo(me.getMyLocation());
        }});
        
    	mapView.getOverlays().add(me);
        
    	GeoPoint point04 = new GeoPoint((int) (39.9613338*1E6), (int) (-75.1750618*1E6));
        OverlayItem overlayitem04 = new OverlayItem(point04, 
        		"Rodin Museum", "Benjamin Franklin Parkway at 22nd Street, Philadelphia, PA 19101-7646");
        
        GeoPoint point07 = new GeoPoint((int) (39.9488168*1E6), (int) (-75.146946*1E6));
        OverlayItem overlayitem07 = new OverlayItem(point07, 
        		"National Liberty Museum", "321 Chestnut St, Philadelphia, PA 19106");
        
        GeoPoint point09 = new GeoPoint((int) (39.965231*1E6), (int) (-75.17983*1E6));
        OverlayItem overlayitem09 = new OverlayItem(point09, 
        		"Philadelphia Museum of Art", "26th Street and the Benjamin Franklin Parkway, Philadelphia, PA 19130");
        
        GeoPoint point19 = new GeoPoint((int) (39.952221*1E6), (int) (-75.144961*1E6));
        OverlayItem overlayitem19 = new OverlayItem(point19, 
        		"F.E.U.L.", "249 Arch Street, Philadelphia, PA 19106");
        
        GeoPoint point21 = new GeoPoint((int) (39.9584076*1E6), (int) (-75.1566952*1E6));
        OverlayItem overlayitem21 = new OverlayItem(point21, 
        		"Vox Populi", "319 North 11th Street, 3rd Floor Philadelphia, PA 19107");
        
        GeoPoint point22 = new GeoPoint((int) (39.9556192*1E6), (int) (-75.1631003*1E6));
        OverlayItem overlayitem22 = new OverlayItem(point22, 
        		"Pennsylvania Academy of the Fine Arts", "128 N. Broad Street, Philadelphia, PA 19102");
        
        GeoPoint point23 = new GeoPoint((int) (40.7643514*1E6), (int) (-73.9987268*1E6));
        OverlayItem overlayitem23 = new OverlayItem(point23, 
        		"Mew Gallery", "906 Christian Street Philadelphia, PA 19147");
        
        GeoPoint point25 = new GeoPoint((int) (39.9539987*1E6), (int) (-75.1948068*1E6));
        OverlayItem overlayitem25 = new OverlayItem(point25, 
        		"Institute of Contemporary Art", "118 S. 36th Street, Philadelphia, PA 19104");
        
        GeoPoint point26 = new GeoPoint((int) (39.9850167*1E6), (int) (-75.2162246*1E6));
        OverlayItem overlayitem26 = new OverlayItem(point26, 
        		"Shofusos Japanese House and Garden", "4700 States Drive, Philadelphia, PA 19131");
        
        
        GeoPoint point27 = new GeoPoint((int) (39.9448931*1E6), (int) (-75.1601009*1E6));
        OverlayItem overlayitem27 = new OverlayItem(point27, 
        		"Seraphin Gallery", "1108 Pine Street, Philadelphia, PA 19107");
        
        GeoPoint point29 = new GeoPoint((int) (39.94816*1E6), (int) (-75.1701719*1E6));
        OverlayItem overlayitem29 = new OverlayItem(point29, 
        		"Lisa M. Reisman et Cie", "1714 Rittenhouse Square, Philadelphia, PA 19103");
        
        GeoPoint point37 = new GeoPoint((int) (40.0821223*1E6), (int) (-75.2198333*1E6));
        OverlayItem overlayitem37 = new OverlayItem(point37, 
        		"Woodmere Art Museum", "9201 Germantown Avenue, Philadelphia, PA 19118");
        
        GeoPoint point39 = new GeoPoint((int) (39.905622*1E6), (int) (-75.1754017*1E6));
        OverlayItem overlayitem39 = new OverlayItem(point39, 
        		"American Swedish Historical Museum", "1900 Pattison Avenue, Philadelphia, PA 19145");
        
        GeoPoint point41 = new GeoPoint((int) (39.938836*1E6), (int) (-75.154966*1E6));
        OverlayItem overlayitem41 = new OverlayItem(point41, 
        		"Davinci Art Alliance", "704 Catharine St, Philadelphia, PA 19147");
        
        GeoPoint point46 = new GeoPoint((int) (39.951241*1E6), (int) (-75.1435244*1E6));
        OverlayItem overlayitem46 = new OverlayItem(point46, 
        		"Muse Gallery", "52 North 2nd Street, Philadelphia, PA 19106");
        
        GeoPoint point48 = new GeoPoint((int) (39.947414*1E6), (int) (-75.1683691*1E6));
        OverlayItem overlayitem48 = new OverlayItem(point48, 
        		"Romainian Folk Art Museum", "1606 Spruce St., Philadelphia, PA 19103");
        
        GeoPoint point50 = new GeoPoint((int) (39.9944578*1E6), (int) (-75.1918948*1E6));
        OverlayItem overlayitem50 = new OverlayItem(point50, 
        		"Strawberry Mansion House", "2450 Strawberry Mansion Drive., Philadelphia, PA  19132");
        
        GeoPoint point51 = new GeoPoint((int) (40.6903303*1E6), (int) (-73.9896472*1E6));
        OverlayItem overlayitem51 = new OverlayItem(point51, 
        		"Sweetbriar Mansion", "1 Sweetbriar Lane, Fairmount Park West, Philadelphia, PA 19131-3792");
        
        GeoPoint point52 = new GeoPoint((int) (39.9765889*1E6), (int) (-75.2007472*1E6));
        OverlayItem overlayitem52 = new OverlayItem(point52, 
        		"Woodford Mansion", "33rd & Dauphin Streets, East Fairmount Park, Philadelphia, PA 19132");
        
        GeoPoint point56 = new GeoPoint((int) (39.9335523*1E6), (int) (-75.147356*1E6));
        OverlayItem overlayitem56 = new OverlayItem(point56, 
        		"Mummers Museum", "1102 S. 2nd St, Philadelphia, PA 19147");
        
        
        
        
        itemizedOverlay.addOverlay(overlayitem04);
        itemizedOverlay.addOverlay(overlayitem07);
        itemizedOverlay.addOverlay(overlayitem09);
        itemizedOverlay.addOverlay(overlayitem19);
        itemizedOverlay.addOverlay(overlayitem21);
        itemizedOverlay.addOverlay(overlayitem22);
        itemizedOverlay.addOverlay(overlayitem23);
        itemizedOverlay.addOverlay(overlayitem25);
        itemizedOverlay.addOverlay(overlayitem26);
        itemizedOverlay.addOverlay(overlayitem27);
        itemizedOverlay.addOverlay(overlayitem29);
        itemizedOverlay.addOverlay(overlayitem37);
        itemizedOverlay.addOverlay(overlayitem39);
        itemizedOverlay.addOverlay(overlayitem41);
        itemizedOverlay.addOverlay(overlayitem46);
        itemizedOverlay.addOverlay(overlayitem48);
        itemizedOverlay.addOverlay(overlayitem50);
        itemizedOverlay.addOverlay(overlayitem51);
        itemizedOverlay.addOverlay(overlayitem52);
        itemizedOverlay.addOverlay(overlayitem56);
        
        mapOverlays.add(itemizedOverlay);
        
		MapController mapControl = mapView.getController();
        mapControl.setCenter(itemizedOverlay.getCenter());
        mapControl.zoomToSpan(itemizedOverlay.getLatSpanE6(), itemizedOverlay.getLonSpanE6());
    }
    
    @Override
	public void onResume() {
		super.onResume();
		me.enableMyLocation();
		me.enableCompass();
	}		

	@Override
	public void onPause() {
		super.onPause();
		me.disableMyLocation();
		me.disableCompass();
	}
    

    protected boolean isRouteDisplayed() {
        return false;
    }
	    
	 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.map_menu, menu);
        return true;
    }
	  
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        
        case R.id.Sat_View:
        	mapView.setSatellite(true);
            mapView.setStreetView(true);
            return true;
            
        case R.id.Map_View:
        	mapView.setSatellite(false);
            mapView.setStreetView(false);
            return true;
        
        case R.id.Map_Menu_All:
        	
    		startActivity(new Intent(this, Maps.class));
    		Toast.makeText(this, R.string.toast_all, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Free:
    		
    		startActivity(new Intent(this, MapsFree.class));
    		Toast.makeText(this, R.string.toast_free, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Art:
    		
    		startActivity(new Intent(this, MapsArt.class));
    		Toast.makeText(this, R.string.toast_art, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Mansion:
    		
    		startActivity(new Intent(this, MapsMansion.class));
    		Toast.makeText(this, R.string.toast_mansion, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_History:
    	
    		startActivity(new Intent(this, MapsHistory.class));
    		Toast.makeText(this, R.string.toast_history, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
    	case R.id.Map_Menu_Science:
    	
    		startActivity(new Intent(this, MapsScience.class));
    		Toast.makeText(this, R.string.toast_science, Toast.LENGTH_LONG).show();
    		this.finish();
    		return true;
    		
        default:
            return super.onOptionsItemSelected(item);
        }
    }   
	    
	    
    public class MuseumItemizedOverlay extends ItemizedOverlay {

    	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
    	
    	public MuseumItemizedOverlay(Drawable defaultMarker) {
    		super(boundCenterBottom(defaultMarker));
    		
    		// TODO Auto-generated constructor stub
    	}
    	
    	public void addOverlay(OverlayItem overlay) {
    	    mOverlays.add(overlay);
    	    populate();
    	}

    	@Override
    	protected OverlayItem createItem(int i) {
    		// TODO Auto-generated method stub
    		return mOverlays.get(i);
    	}

    	@Override
    	public int size() {
    		// TODO Auto-generated method stub
    		return mOverlays.size();
    	}
    	
    	@Override
    	protected boolean onTap(int index) {
    	
    	
    	  final OverlayItem item = mOverlays.get(index);
    	  AlertDialog.Builder dialog = new AlertDialog.Builder(MapsArt.this);
    	  dialog.setTitle(item.getTitle());
    	  dialog.setMessage(item.getSnippet());
    	  
    	  dialog.setNegativeButton("Navigate", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=" + item.getSnippet())));
				
			}
		});
    	  
    	  dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int id) {
				dialog.cancel();
				
			}
		});
    	  dialog.show();
    	 
    	  return true;
    	}

    }

}